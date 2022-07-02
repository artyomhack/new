package com.my.app.core.data;

import com.my.app.core.domain.RelationRepository;
import com.my.app.domain.task.TaskId;
import com.my.app.domain.user.UserId;

import java.io.File;
import java.util.List;

public abstract class RelationFileRepository<MainID extends UserId, RelateID extends TaskId>
        implements RelationRepository<MainID, RelateID> {

    private final static String RELATION_DATA_PATH = ".task_user"; //task_user

    private final String relationsPath;


    public RelationFileRepository(Class<MainID> mainIdClass, Class<RelateID> relateIdClass) {
        relationsPath = RELATION_DATA_PATH + File.separator +
                        mainIdClass.getSimpleName() + "_" + relateIdClass.getSimpleName();
    }
//    main | relate
//    81_54
//    92_33


    @Override
    public List<RelateID> findRelations(MainID mainId) {
        
    }

    @Override
    public List<MainID> findReverseRelations(RelateID relateId) {
        return null;
    }

    @Override
    public void addRelation(MainID mainId, RelateID relateId) {
        RelationRepository.super.addRelation(mainId, relateId);
    }

    @Override
    public void addRelations(MainID mainId, Iterable<RelateID> relateIds) {

    }

    @Override
    public void addReverseRelation(RelateID relateId, MainID mainId) {
        RelationRepository.super.addReverseRelation(relateId, mainId);
    }

    @Override
    public void addReverseRelations(RelateID relateId, Iterable<MainID> mainIds) {

    }
}
