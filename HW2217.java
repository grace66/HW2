//2.2.17 Linked-list sort. Implement a natural mergesort for linked lists. (This is the  
//method of choice for sorting linked lists because it uses no extra space and is guaranteed to be linearithmic.)
//sort self-defined object linkedlist in Java


import java.util.LinkedList;
import java.util.Sorting;

public class HW2217 {

public class LinkedList {
 
 List startList;
  
 public static void main(String[] args) {
  new LinkedList();
 }
 
 public LinkedList() {
  Node list1 = new List(10);
  Node list2 = new List(1);
  Node list3 = new List(-2);
  Node list4 = new List(8);
  Node list5 = new List(9);
  Node list6 = new List(10);
  Node list7 = new List(1);
 
  list1.setNext(list2);
  list2.setNext(list3);
  list3.setNext(list4);
  list4.setNext(list5);
  list5.setNext(list6);
  list6.setNext(list7);
 
  startList = list1;
   
  List sortedStartList = mergeLinkList(startList);
  printLinkList(sortedStartList);
 }
 
 private List mergeLinkList(List startList){
   
  
  if(startList==null || startList.getNext()==null){
   return startList;
  }
 
  
   
  List middle = getMiddle(startList);
  List nextOfMiddle = middle.getNext();
  middle.setNext(null);
 
  List left = mergeLinkList(startList);
  List right = mergeLinkList(nextOfMiddle);
 
   
  List sortedList = mergeTwoListRecursive(left, right);
   
  return sortedList;
 }
 
 
 private List mergeTwoListRecursive(List leftStart, List rightStart){
  if(leftStart==null)
   return rightStart;
   
  if(rightStart==null)
   return leftStart;
 
  List temp=null;
   
  if(leftStart.getData()<rightStart.getData()){
   temp=leftStart;
   temp.setNext(mergeTwoListRecursive(leftStart.getNext(), rightStart));
  }else{
   temp=rightStart;
   temp.setNext(mergeTwoListRecursive(leftStart, rightStart.getNext()));
  }
  return temp;
 }
 
 private List getMiddle(List startList) {
  if(startList==null){
   return startList;
  }
 
  List pointer1=startList;
  List pointer2=startList;
   
  while(pointer2!=null && pointer2.getNext()!=null && pointer2.getNext().getNext()!=null){
   pointer1 = pointer1.getNext();
   pointer2 = pointer2.getNext().getNext();
 
  }
  return pointer1;
 }
 
 private void printLinkList(List startList) {
  List temp = startList;
  while(temp!=null){
   System.out.print(temp.getData() + "LinkedList:  ");
   temp = temp.getNext();
  }
 }
  
}

 
