package com.webapp.project.modules.classes.model.modeleditor;

import java.beans.PropertyEditorSupport;

import com.webapp.project.modules.classes.model.Classes;

public class ClassesEditor extends PropertyEditorSupport{

    //This will be called when user HTTP Post to server a field bound to DepartmentVO
    public void setAsText(String id) 
    {
    	Classes d;
        switch(Integer.parseInt(id))
        {
        	//instead of using hardcoded part here...and using switch case
        	//pass id and get it from the teacherCache
            case 3: d = new Classes(1,  "Class One"); break;
            case 2: d = new Classes(2,  "Class Two"); break;
            default: d = null;
        }
        this.setValue(d);
    }
}
