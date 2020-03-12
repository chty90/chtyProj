package chty.comm.Dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommonDao{

    protected Log log = LogFactory.getLog(CommonDao.class);

    @Autowired
    private SqlSessionTemplate sqlSession;

    public CommonDao(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    protected void printQueryId(String queryId) {
        if (log.isDebugEnabled()) {
            log.debug("\t QueryId \t: " + queryId);
        }
    }

    public Object insert(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.insert(queryId, params);
    }

    public Object update(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.update(queryId, params);
    }

    public Object delete(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.delete(queryId, params);
    }

    public Object selectOne(String queryId) {
        printQueryId(queryId);
        return sqlSession.selectOne(queryId);
    }

    public Object selectOne(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.selectOne(queryId, params);
    }

    public List selectList(String queryId) {
        printQueryId(queryId);
        return sqlSession.selectList(queryId);
    }

    public List selectList(String queryId, Object params) {
        printQueryId(queryId);
        return sqlSession.selectList(queryId, params);
    }

}
