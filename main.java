import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args){

        
        /*
        Books book1 = new Books();
        System.out.println(book1.getISBN());
        System.out.println(book1.getTitle());
        */


        /*
        Books book2 = new Books("1", "Percy Jackson", "ABC123");
        System.out.println(book2.getISBN());
        System.out.println(book2.getTitle());
        System.out.println(book2.getCollectionID());
        */
      
        Date dob = new Date(0);
        Member member1 = new Member();
        ArrayList<Member> memArr = new ArrayList<>();
        memArr.add(member1);

        //UpdateMember.update(memArr);
    
        //UpdateMember.update(member1);

        newCollectionEvent.newCollectionEvent();
        RemoveCollectionEvent.removeCollectionEvent();

        Checkout.checkouts(memArr);
        checkInEvent.checkInEvent(memArr);

        //should make some data for each (books, dvd, journals, newpapers, professor, student, external, technicians)
        
        //------------------------------------
        //check all is working 

        //newEmployee, 
        //newEmployee.newEmployeeEvent();
        //YAYYYY works

        //newCOllectionEvent, 
        //newCollectionEvent.newCollectionEvent();
        //it workzzz
       

        //newMemberEvent, 
        //newMemberEvent.newMemberEvent();
        //yayyyyy it works
        
        //removeCollectionEvent, 
        //removeCollectionEvent.removeCollectionEvent();
        //yay it worksssz
        
        //removeEmployeeEvent, 
        //removeEmployeeEvent.removeEmployeeEvent();
        //it works ayayyayayayyayayyyyay
        
        //updateMember, 


        
        //CheckInEvent, 
        //checkInEvent.checkInEvent();
        //works just need to change txt files name 
       
        
        //checkoutEvent
        
    }
}
