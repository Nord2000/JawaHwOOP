
// Односвязный 
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }
    return prev;
}


// двусвязный
public DoublyListNode reverseList(DoublyListNode head) {
    DoublyListNode prev = null;
    DoublyListNode curr = head;
    while (curr != null) {
        DoublyListNode nextTemp = curr.next;
        curr.next = prev;
        curr.prev = nextTemp;
        prev = curr;
        curr = nextTemp;
    }
    return prev;
}