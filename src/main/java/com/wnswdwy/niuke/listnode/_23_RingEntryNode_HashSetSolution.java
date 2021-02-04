package com.wnswdwy.niuke.listnode;

import java.util.HashSet;

/**
 * @author yycstart
 * @create 2021-02-03 14:25
 */
public class _23_RingEntryNode_HashSetSolution {



        public ListNode EntryNodeOfLoop(ListNode head)
        {
            HashSet<ListNode> hashSet = new HashSet<>();
            while(head != null){
                if(!hashSet.add(head)){
                    return head;
                }
                head = head.next;
            }
            return null;
        }

}
