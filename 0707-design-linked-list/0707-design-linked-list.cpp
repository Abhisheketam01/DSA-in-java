/*
// Node structure
struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(NULL) {}
};
*/
class MyLinkedList {
public:
    ListNode* head;  // head of the linked list

    // Constructor
    MyLinkedList() {
        head = NULL;
    }
    
    // Get value at index
    int get(int index) {
        ListNode* temp = head;
        int i = 0;
        while (temp != NULL && i < index) {
            temp = temp->next;
            i++;
        }
        if (temp == NULL) return -1;
        return temp->val;
    }
    
    // Add at head
    void addAtHead(int val) {
        ListNode* newNode = new ListNode(val);
        newNode->next = head;
        head = newNode;
    }
    
    // Add at tail
    void addAtTail(int val) {
        ListNode* newNode = new ListNode(val);
        if (head == NULL) {
            head = newNode;
            return;
        }
        ListNode* temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = newNode;
    }
    
    // Add at index
    void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        ListNode* temp = head;
        int i = 0;
        while (temp != NULL && i < index - 1) {
            temp = temp->next;
            i++;
        }
        if (temp == NULL) return; // index > length
        ListNode* newNode = new ListNode(val);
        newNode->next = temp->next;
        temp->next = newNode;
    }
    
    // Delete at index
    void deleteAtIndex(int index) {
        if (head == NULL) return;
        if (index == 0) {
            ListNode* temp = head;
            head = head->next;
            delete temp;
            return;
        }
        ListNode* temp = head;
        int i = 0;
        while (temp->next != NULL && i < index - 1) {
            temp = temp->next;
            i++;
        }
        if (temp->next == NULL) return;
        ListNode* nodeToDelete = temp->next;
        temp->next = nodeToDelete->next;
        delete nodeToDelete;
    }
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */
