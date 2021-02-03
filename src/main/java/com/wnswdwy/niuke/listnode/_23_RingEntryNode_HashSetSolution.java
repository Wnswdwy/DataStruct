package com.wnswdwy.niuke.listnode;

import java.util.HashSet;

/**
 * @author yycstart
 * @create 2021-02-03 14:25
 */
public class _23_RingEntryNode_HashSetSolution {



        public ListNode23 EntryNodeOfLoop(ListNode23 head)
        {
            HashSet<ListNode23> hashSet = new HashSet<>();
            while(head != null){
                if(!hashSet.add(head)){
                    return head;
                }
                head = head.next;
            }
            return null;
        }

}

class ListNode23 {
    int val;
    ListNode23 next = null;

    ListNode23(int val) {
        this.val = val;
    }
}
