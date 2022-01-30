/**
 * 
 */
package com.ofs.sms.ui.services;

import java.util.List;

import com.ofs.sms.ui.responses.StudentMgmtResponse;
import com.ofs.sms.ui.vos.StudentVO;


/**
 * @author Lalitha
 *
 */
public interface StudentsService {

	StudentMgmtResponse<List<StudentVO>> getStudentsList();

}
