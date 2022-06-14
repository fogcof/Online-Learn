/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Quiz {
    int qid;
    String qname;
    String qdesc;
    String cid;
    int tid;
    int sid;

    public Quiz() {
    }

    public Quiz(int qid, String qname, String qdesc, String cid, int tid, int sid) {
        this.qid = qid;
        this.qname = qname;
        this.qdesc = qdesc;
        this.cid = cid;
        this.tid = tid;
        this.sid = sid;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public String getQdesc() {
        return qdesc;
    }

    public void setQdesc(String qdesc) {
        this.qdesc = qdesc;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

   
    
}
