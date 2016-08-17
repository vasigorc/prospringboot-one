/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vgorcinschi.bootone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vgorcinschi.bootone.domain.Journal;

/**
 *
 * @author v_gorcin
 */
public interface JournalRepository extends JpaRepository<Journal, Long>{
}
