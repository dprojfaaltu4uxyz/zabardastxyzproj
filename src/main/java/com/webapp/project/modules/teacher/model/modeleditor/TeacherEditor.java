package com.webapp.project.modules.teacher.model.modeleditor;

import java.beans.PropertyEditorSupport;

import com.webapp.project.modules.teacher.model.Teacher;

public class TeacherEditor extends PropertyEditorSupport{

    //This will be called when user HTTP Post to server a field bound to DepartmentVO
    public void setAsText(String id) 
    {
        Teacher d;
        switch(Integer.parseInt(id))
        {
        	//instead of using hardcoded part here...and using switch case
        	//pass id and get it from the teacherCache
            case 3: d = new Teacher(3,  "Akshay"); break;
            case 2: d = new Teacher(2,  "Gautam"); break;
            default: d = null;
        }
        this.setValue(d);
    }
}
