package com.norris.believer.Bean;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.norris.believer.Bean.DDAudioBean;
import com.norris.believer.Bean.ReadPlanDraft;
import com.norris.believer.Bean.VideoBean;
import com.norris.believer.Bean.IntroBean;

import com.norris.believer.Bean.DDAudioBeanDao;
import com.norris.believer.Bean.ReadPlanDraftDao;
import com.norris.believer.Bean.VideoBeanDao;
import com.norris.believer.Bean.IntroBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dDAudioBeanDaoConfig;
    private final DaoConfig readPlanDraftDaoConfig;
    private final DaoConfig videoBeanDaoConfig;
    private final DaoConfig introBeanDaoConfig;

    private final DDAudioBeanDao dDAudioBeanDao;
    private final ReadPlanDraftDao readPlanDraftDao;
    private final VideoBeanDao videoBeanDao;
    private final IntroBeanDao introBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dDAudioBeanDaoConfig = daoConfigMap.get(DDAudioBeanDao.class).clone();
        dDAudioBeanDaoConfig.initIdentityScope(type);

        readPlanDraftDaoConfig = daoConfigMap.get(ReadPlanDraftDao.class).clone();
        readPlanDraftDaoConfig.initIdentityScope(type);

        videoBeanDaoConfig = daoConfigMap.get(VideoBeanDao.class).clone();
        videoBeanDaoConfig.initIdentityScope(type);

        introBeanDaoConfig = daoConfigMap.get(IntroBeanDao.class).clone();
        introBeanDaoConfig.initIdentityScope(type);

        dDAudioBeanDao = new DDAudioBeanDao(dDAudioBeanDaoConfig, this);
        readPlanDraftDao = new ReadPlanDraftDao(readPlanDraftDaoConfig, this);
        videoBeanDao = new VideoBeanDao(videoBeanDaoConfig, this);
        introBeanDao = new IntroBeanDao(introBeanDaoConfig, this);

        registerDao(DDAudioBean.class, dDAudioBeanDao);
        registerDao(ReadPlanDraft.class, readPlanDraftDao);
        registerDao(VideoBean.class, videoBeanDao);
        registerDao(IntroBean.class, introBeanDao);
    }
    
    public void clear() {
        dDAudioBeanDaoConfig.clearIdentityScope();
        readPlanDraftDaoConfig.clearIdentityScope();
        videoBeanDaoConfig.clearIdentityScope();
        introBeanDaoConfig.clearIdentityScope();
    }

    public DDAudioBeanDao getDDAudioBeanDao() {
        return dDAudioBeanDao;
    }

    public ReadPlanDraftDao getReadPlanDraftDao() {
        return readPlanDraftDao;
    }

    public VideoBeanDao getVideoBeanDao() {
        return videoBeanDao;
    }

    public IntroBeanDao getIntroBeanDao() {
        return introBeanDao;
    }

}
