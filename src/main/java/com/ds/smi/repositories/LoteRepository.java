package com.ds.smi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ds.smi.model.Lote;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Integer> {

}
