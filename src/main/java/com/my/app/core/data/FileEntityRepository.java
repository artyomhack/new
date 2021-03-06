package com.my.app.core.data;

import com.my.app.core.domain.Entity;
import com.my.app.core.domain.DataRepository;
import com.my.app.core.domain.EntityId;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class FileEntityRepository<T extends Entity<ID>, ID extends EntityId<?>>
        implements DataRepository<T, ID> {

    public final static String DATA_PATH = ".data";

    private final String entityPath;

    protected FileEntityRepository(Class<T> entityClass) {
        entityPath = DATA_PATH + File.separator + entityClass.getSimpleName().replaceFirst("Entity", "");
    }

    public ID save(T entity) {

        var id = entity.getId();

        if (id.isEmpty()) {
            id = getNextId();
        }

        var entityFile = getFileById(id);

        try {
            Files.deleteIfExists(entityFile.toPath());
            var fileStream = new FileOutputStream(entityFile);
            var objectStream = new ObjectOutputStream(fileStream);
            objectStream.writeObject(entity);
            objectStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }


    @Override
    public T findById(ID id) {
        var entityFile = getFileById(id);
        return retrieveOfFile(entityFile);
    }

    @Override
    public List<T> findAll() {
        var allFiles = new File(entityPath).listFiles();
        if (Objects.nonNull(allFiles) && allFiles.length > 0) {
            return Arrays.stream(allFiles)
                    .map(this::retrieveOfFile)
                    .filter(Objects::nonNull)
                    .sorted()
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }


    @SuppressWarnings("unchecked")
    private T retrieveOfFile(File file) {
        try {
            var stream = new ObjectInputStream(new FileInputStream(file));
            var entity = (T) stream.readObject();
            stream.close();
            return entity;
        } catch (Exception ignored) {
        }
        return null;
    }

    @Override
    public ID getLastId() {
        var ids = findAll().stream().map(this::mapOfSrc).toList();
        return mapOfSrc(ids.get(ids.size() - 1));
    }

    @Override
    public boolean deleteById(ID id) {
        try {
            if (getFileById(id).exists()) {
                Files.deleteIfExists(getFileById(id).toPath());
                return true;
            }
        } catch (Exception ignored) {
        }
        return false;
    }

    private File getFileById(ID id) {
        return new File(entityPath + File.separator + id);
    }

    abstract protected  ID mapOfSrc(Object src);
}
