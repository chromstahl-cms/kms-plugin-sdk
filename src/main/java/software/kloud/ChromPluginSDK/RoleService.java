package software.kloud.ChromPluginSDK;

import software.kloud.kms.entities.RoleJpaRecord;

public interface RoleService {
    RoleJpaRecord getAdminRole();
    RoleJpaRecord getUserRole();
    RoleJpaRecord getGuestRole();
    RoleJpaRecord getRoleFor(String group);
}
