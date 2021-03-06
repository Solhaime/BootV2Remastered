package SpringBootApp.service.roleService;

import SpringBootApp.DAO.roleDao.RoleDao;
import SpringBootApp.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleDao roleDao;

    @Override
    public void addRole( String role ) {
        roleDao.addRole(role);
    }

    @Override
    public Role getRoleById( long id ) {
        return roleDao.getRoleById(id);
    }

    @Override
    public Collection<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Override
    public Role getRoleByName( String role ) {
        return roleDao.getRoleByName(role);
    }

}
