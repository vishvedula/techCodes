public class InstanceVariableExample { 
    int instanceVarId; 
    String instanceVarName; 
    public static void main(String args[]) 
    { 
        InstanceVariableExample obj = new InstanceVariableExample(); 
        obj.instanceVarId = 0001; 
        obj.instanceVarName = "InstanceVariable1"; 
        System.out.println("Displaying first Object:"); 
        System.out.println("instanceVarId==" + obj.instanceVarId); 
        System.out.println("instanceVarName==" + obj.instanceVarName); 
  
        InstanceVariableExample obj1 = new InstanceVariableExample(); 
        obj1.instanceVarId = 0002; 
        obj1.instanceVarName = "InstanceVariable2"; 
        System.out.println("Displaying Second Object:"); 
        System.out.println("instanceVarId==" + obj1.instanceVarId); 
        System.out.println("instanceVarName==" + obj1.instanceVarName); 
    } 
} 
