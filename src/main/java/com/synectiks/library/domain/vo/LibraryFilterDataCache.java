package com.synectiks.library.domain.vo;

import com.synectiks.library.domain.Batch;
import com.synectiks.library.domain.Department;
import com.synectiks.library.domain.Student;

import java.util.List;

public class LibraryFilterDataCache {

    private List<Department> departments;
    private List<Batch> batches;
    private List<CmsIssueBookVo> issueBooks;
    private List<CmsBookVo> books;
    private List<Student> students;

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Batch> getBatches() {
        return batches;
    }

    public void setBatches(List<Batch> batches) {
        this.batches = batches;
    }

    public List<CmsIssueBookVo> getIssueBooks() {
        return issueBooks;
    }

    public void setIssueBooks(List<CmsIssueBookVo> issueBooks) {
        this.issueBooks = issueBooks;
    }

    public List<CmsBookVo> getBooks() {
        return books;
    }

    public void setBooks(List<CmsBookVo> books) {
        this.books = books;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
