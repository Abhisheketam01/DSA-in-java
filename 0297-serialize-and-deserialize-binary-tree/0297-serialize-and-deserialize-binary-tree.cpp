/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Codec {
public:
    // Serialize using preorder
    void serializeHelper(TreeNode* root, string &s) {
        if(!root) {
            s += "#,";
            return;
        }
        s += to_string(root->val) + ",";
        serializeHelper(root->left, s);
        serializeHelper(root->right, s);
    }

    string serialize(TreeNode* root) {
        string s;
        serializeHelper(root, s);
        return s;
    }

    // Deserialize using preorder
    TreeNode* deserializeHelper(vector<string>& v, int &i) {
        if (v[i] == "#") {
            i++;
            return nullptr;
        }
        TreeNode* node = new TreeNode(stoi(v[i++]));
        node->left = deserializeHelper(v, i);
        node->right = deserializeHelper(v, i);
        return node;
    }

    TreeNode* deserialize(string data) {
        vector<string> v;
        string cur;
        for (char c : data) {
            if (c == ',') {
                v.push_back(cur);
                cur.clear();
            } else cur.push_back(c);
        }
        int i = 0;
        return deserializeHelper(v, i);
    }
};


// Your Codec object will be instantiated and called as such:
// Codec ser, deser;
// TreeNode* ans = deser.deserialize(ser.serialize(root));