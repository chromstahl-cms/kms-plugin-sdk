package software.kloud.KMSPluginSDK;

import software.kloud.kms.entities.RoleJpaRecord;

public interface RoleService {
    RoleJpaRecord getRoleFor(String group);
}
