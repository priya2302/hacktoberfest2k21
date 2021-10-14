#include <bits/stdc++.h>
using namespace std;
 
class Node
{
    public:
    int data;
    Node *next;

Node(int val)
{
    data=val;
    next=NULL;
}

};
 void insertattail(Node* &head,int val)
 {
    Node* n=new Node(val);
    if(head==NULL)
    {
        head=n;
        return;
    }
    Node* temp=head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=n;

 }
 void insertathead(Node* &head,int val)
 {
    Node* temp=new Node(val);
    temp->next=head;
    head=temp;
 }
 void printmiddle(Node* &head)
 {
    Node* slow_ptr=head;
    Node* fast_ptr=head;
    while(fast_ptr!=NULL&&fast_ptr->next!=NULL)
    {
        fast_ptr=fast_ptr->next->next;
        slow_ptr=slow_ptr->next;
    }
    cout<<"Middle of the linked list is:"<<slow_ptr->data<<endl;
 }
void display(Node* &head)
{
    Node* temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}
int main()
{
    Node* head=NULL;
    insertattail(head,1);
     insertattail(head,2);
      insertattail(head,3);
       insertattail(head,4);
       display(head);
       cout<<"Insert element at head"<<endl;
       int ele;
       cin>>ele;
       insertathead(head,ele);
       display(head);
       printmiddle(head);
}
