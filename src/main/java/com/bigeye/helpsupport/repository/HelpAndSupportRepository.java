package com.bigeye.helpsupport.repository;

import com.bigeye.helpsupport.modal.HelpAndSupport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface HelpAndSupportRepository extends JpaRepository<HelpAndSupport, UUID> {
    List<HelpAndSupport> findByEmail(String email);
}
