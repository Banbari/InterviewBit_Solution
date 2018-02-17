/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 * 
 * typedef struct ListNode listnode;
 * 
 * listnode* listnode_new(int val) {
 *     listnode* node = (listnode *) malloc(sizeof(listnode));
 *     node->val = val;
 *     node->next = NULL;
 *     return node;
 * }
 */
/**
 * @input A : Head pointer of linked list 
 * 
 * @Output head pointer of list.
 */
listnode* detectCycle(listnode* A) {
    
    int n;
    if(A == NULL) return;
    listnode* fast = A->next;
    listnode *slow = A;
    while(fast && fast->next) {
        slow = slow->next;
        fast = fast->next->next;
        if(slow == fast) break;
    }
    if(fast == NULL || fast->next == NULL) return NULL;
    n=1;
    listnode *temp = fast->next;
    while(temp !=fast) {
        n++;
        temp = temp->next;
    }
    
    temp = A;
    while(n--) {
        temp = temp->next;
    }
   // temp = temp->next;
    listnode *c = A;
    while(c!=temp) {
        c = c->next;
        temp = temp->next;
    }
    return c;
}