package software.kloud.KMSPluginSDK;

import software.kloud.kms.entities.RoleJpaRecord;

public interface RoleService {
    RoleJpaRecord getAdminRole();
    RoleJpaRecord getUserRole();
    RoleJpaRecord getGuestRole();
    RoleJpaRecord getRoleFor(String group);
}
