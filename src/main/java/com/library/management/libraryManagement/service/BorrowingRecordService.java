package com.library.management.libraryManagement.service;

import com.library.management.libraryManagement.model.Book;
import com.library.management.libraryManagement.model.BorrowingRecord;
import com.library.management.libraryManagement.model.Patron;
import com.library.management.libraryManagement.repository.BookRepository;
import com.library.management.libraryManagement.repository.BorrowingRecordRepository;
import com.library.management.libraryManagement.repository.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
public class BorrowingRecordService {
    @Autowired
    private BorrowingRecordRepository borrowingRecordRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PatronRepository patronRepository;

    public List<BorrowingRecord> getAllBorrowingRecords() {
        return borrowingRecordRepository.findAll();
    }

    public BorrowingRecord borrowBook(Long bookId, Long patronId) {
        Book book = bookRepository.findById(bookId).orElse(null);
        Patron patron = patronRepository.findById(patronId).orElse(null);

        if (book != null && patron != null) {
            BorrowingRecord record = new BorrowingRecord();
            record.setBook(book);
            record.setPatron(patron);
            record.setBorrowDate(new Date());
            return borrowingRecordRepository.save(record);
        }

        return null;
    }

    public BorrowingRecord returnBook(Long bookId, Long patronId) {
        /*BorrowingRecord record = borrowingRecordRepository.findbyBookIdAndPatronId( bookId, patronId);
        if (record != null) {
            record.setReturnDate(new Date());
            return borrowingRecordRepository.save(record);
        }*/

        return null;
    }
}
