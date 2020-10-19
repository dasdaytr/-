package laba14;
public class SortStudent implements Comparator {
    public int compareTo(Student one, Student two,int i) {
        switch (i) {
            case 1:
                if (one.getID() < two.getID()) {
                    return 1;
                }
                if (one.getID() > two.getID()) {
                    return 2;
                }
            case 2:
                if (one.getID() > two.getID()) return 1;
        }
        return 3;
    }
    public Comparable binarySearch(Comparable []student, Comparable elementToSearch){
        int firstIndex = 0;
        int lastIndex = student.length - 1;
        while(firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (student[middleIndex].equals(elementToSearch)){
                return student[middleIndex];
            }
            else if (student[middleIndex].compare(student[middleIndex],1) < elementToSearch.compare(elementToSearch,1))
                firstIndex = middleIndex+1;
            else if (student[middleIndex].compare(student[middleIndex],1) > elementToSearch.compare(elementToSearch,1))
                lastIndex = middleIndex -1 ;
        }
        return null;
    }
    public  Comparable recursiveBinarySearch(Comparable []student,int firstElement,int lastElement,Comparable elementToSearch){
        if (lastElement >= firstElement){
            int mid = firstElement + (lastElement - firstElement) /2;
            if (student[mid].equals(elementToSearch)){
                return student[mid];
            }
            if (student[mid].compare(student[mid],1)> elementToSearch.compare(elementToSearch,1)){
                return recursiveBinarySearch(student,firstElement,mid-1,elementToSearch);

            }
            return recursiveBinarySearch(student,mid+1,lastElement,elementToSearch);
        }
        return null;
    }
    public void quicksort(Student[]students, int low, int high){
        if (students.length == 0){
            return;
        }
        if (low >= high){
            return;
        }
        int middle = low +(high - low)/2;
        Student student = students[middle];
        int i = low, j = high;
        while (i <= j){
            while (compareTo(students[i],student,1 )== 1){
                i++;
            }
            while (compareTo(students[j],student,1) ==2){
                j--;
            }
            if (i <= j){
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
            if ( low < j ){
                quicksort(students,low,j);
            }
            if (high > i ){
                quicksort(students,i,high);
            }
        }

    }
    public Comparable linearSearch(Comparable []students,Comparable elementToSearch){
        for (int index = 0; index <students.length; index ++){
            if (students[index].equals(elementToSearch)){
                return students[index];
            }
        }
        return null;
    }
    public Comparable recursialinearSearch(Comparable []students,Comparable elementToSearch,int index){
        if (students[index].equals(elementToSearch)){
            return students[index];

        }
        index++;
        if (students.length == index){
            return null;
        }
        return recursialinearSearch(students,elementToSearch,index);

    }
}
