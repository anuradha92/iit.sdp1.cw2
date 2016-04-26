package test.iit.sdp.cw.dao;

import iit.sdp.cw.dao.ModuleResultDAO;
import iit.sdp.cw.module.Module;
import iit.sdp.cw.util.FileStoreManager;
import junit.framework.TestCase;

/**
 * Created by harsha on 4/26/16.
 */
public class ModuleResultDAOTest extends TestCase {

    public void testAddModuleResult() throws Exception {

        FileStoreManager.createEntity("0002");

        ModuleResultDAO moduleResultDAO = new ModuleResultDAO();
        Module m = new Module();
        m.setCode("code001");
        m.setMarks(3);
        moduleResultDAO.addModuleResult("0002", "1", m);
        m = new Module();
        m.setCode("code002");
        m.setMarks(33);
        moduleResultDAO.addModuleResult("0002", "1", m);
        m = new Module();
        m.setCode("code003");
        m.setMarks(44);
        moduleResultDAO.addModuleResult("0002", "1", m);
    }
}