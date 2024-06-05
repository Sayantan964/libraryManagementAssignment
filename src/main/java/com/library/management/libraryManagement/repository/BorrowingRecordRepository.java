package com.library.management.libraryManagement.repository;

import com.library.management.libraryManagement.model.BorrowingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecord, Long> {
   /* @Query("")
    BorrowingRecord findbyBookIdAndPatronId(Long bookId, Long patronId);*/
}
