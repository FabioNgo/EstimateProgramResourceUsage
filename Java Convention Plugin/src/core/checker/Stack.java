package core.checker;

class Stack{
    String image;
    int endCol;
    int line;
    int addition;
    Stack next;
    Stack(){
        image="";
        endCol  = -1;
        line = -1;
        addition = -1;
        next = null;
    }
    Stack(String _image, int _endCol, int _line, int _addition){
        image= _image;
        endCol  = _endCol;
        line = _line;
        addition = _addition;
        next = null;
    }
    void insert(String _image, int _endCol, int _line, int _addition){
        Stack temp = new Stack(_image, _endCol,_line,_addition);
        temp.next = next;
        next = temp;
    }
    void remove(){
        next = next.next;
    }
    Stack get(){
        return next;
    }
}

