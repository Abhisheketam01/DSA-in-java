/*
1. Algorithm 
2. pseudocdeo
3. code
4.questions pareto
5. brutal test cases
6. why this and why that
7. dry run 
8. why it works


Space + implement 



*/


class Trie {
private:
    struct Node {
        bool isEnd;
        Node* next[26];
        Node() {
            isEnd = false;
            for (int i = 0; i < 26; i++) next[i] = nullptr;
        }
    };

    Node* root;
public:
    Trie() {
        root = new Node();
    }

    void insert(string word) {
        Node* cur = root;
        for (char c : word) {
            int idx = c - 'a';
            if (!cur->next[idx])
                cur->next[idx] = new Node();
            cur = cur->next[idx];
        }
        cur->isEnd = true;
    }

    bool search(string word) {
        Node* cur = root;
        for (char c : word) {
            int idx = c - 'a';
            if (!cur->next[idx]) return false;
            cur = cur->next[idx];
        }
        return cur->isEnd;
    }

    bool startsWith(string prefix) {
        Node* cur = root;
        for (char c : prefix) {
            int idx = c - 'a';
            if (!cur->next[idx]) return false;
            cur = cur->next[idx];
        }
        return true;
    }
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */