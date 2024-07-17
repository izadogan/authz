package com.acme.authz.repository.access;

import com.acme.authz.repository.entity.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author isa
 * @since 18.07.2024
 */
public interface GroupEntityJpaRepository extends JpaRepository<GroupEntity, String> {
}
