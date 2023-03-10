package dto;

import java.util.Iterator;
import java.util.List;

import dto.iterators.GroupStreamIterator;

public class GroupStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupList;

    public GroupStream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }

}