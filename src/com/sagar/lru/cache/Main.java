package com.sagar.lru.cache;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {



    public static class LRU{


        class Node {

            int key,value;
            Node prev,next;

        }

        //add first
        private void addNode(Node node){

            Node nbr=head.next;
            node.next=nbr;
            node.prev=head;
            nbr.prev=node;
            head.next=node;


        }


        //remove node
        private void removeNode(Node node){

            Node prevNbr=node.prev;
            Node nextNbr=node.next;
            prevNbr.next=nextNbr;
            nextNbr.prev=prevNbr;
            node.next=null;
            node.prev=null;



        }
        //move to front
        private void moveToFront(Node node){
            removeNode(node);
            addNode(node);
        }

        HashMap<Integer,Node> cache;
        private int cap;
        private Node head,tail;

        LRU(int capacity){
            this.cache=new HashMap<>();
            this.cap=capacity;
            this.head=new Node();
            this.tail=new Node();
            head.next=tail;
            tail.prev=head;


        }
        public int get(int key){


                Node node=cache.get(key);

                if(node==null){
                    return -1;

                }
                else{
                    int k=node.value;
                    moveToFront(node);
                    return k;

                }

        }
        public void put(int key,int value){


            Node node=cache.get(key);

            // pair doesn't exist
            if(node==null){

                Node newNode=new Node();
                newNode.key=key;
                newNode.value=value;
                if(cache.size()==this.cap){


                    Node LRU_NODE=tail.prev;
                    cache.remove(LRU_NODE.key);
                    removeNode(LRU_NODE);

                }else{
                    cache.put(key,newNode);
                    addNode(newNode);
                }

            }else{


                node.value=value;
                moveToFront(node); //make recently used
            }
        }
    }

    public static void main(String[] args) throws IOException, Exception{


        LRU obj=new LRU(3);
        obj.put(1,300);
        obj.put(2,500);
        obj.put(3,000);
        obj.put(4,700);
        System.out.println(obj.cache);





    }
}
