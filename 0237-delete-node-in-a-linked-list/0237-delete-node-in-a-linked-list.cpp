// /**
//  * Definition for singly-linked list.
//  * struct ListNode {
//  *     int val;
//  *     ListNode *next;
//  *     ListNode(int x) : val(x), next(NULL) {}
//  * };
//  */
// class Solution {
// public:
//     void deleteNode(ListNode* node) {
//         // Definition of a singly-linked list node (provided by LeetCode)
//         node->val = node->next->val;

//         // Step 2: Skip the next node by pointing to the node after next
//         node->next = node->next->next;  
//     }
// };

// 1st time
/*
Definition for singly linked list
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};
*/



class Solution {
public :
    void deleteNode(ListNode* node){
        node->val = node-> next->val;
        node->next = node->next->next;

    }
};