"""
Nama File: NumberSorting.py
Deskripsi: Sorting tanpa library arraylist

Author: Larynt Sawfa Kenanga
Tanggal dibuat: 29 Maret 2023
"""

class Node:
    def __init__(self, data=None):
        self.data=data
        self.next=None

class LinkedList:
    def __init__(self):
        self.head=None
    
    def add(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            current_node = self.head
            while current_node.next:
                current_node=current_node.next
            current_node.next=new_node
    
    def display(self):
        current_node = self.head
        while current_node:
            print(current_node.data, end=" ")
            current_node=current_node.next

    def sortedValue(self, callback):
        current_node=self.head
        while current_node:
            index = current_node.next
            while index:
                if current_node.data > index.data:
                    temp = current_node.data
                    current_node.data = index.data
                    index.data = temp
                index=index.next
            current_node=current_node.next
        callback()

list=LinkedList()
list.add(9)
list.add(3)
list.add(4)
list.add(6)
list.add(2)
list.add(3)

print("Before : ",end=" ")
list.display()
print("\nAfter : ",end=" ")
list.sortedValue(list.display)