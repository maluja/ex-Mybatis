/*
 * Copyright 2014 MOSPA(Ministry of Security and Public Administration).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.sample.dept.service;

import egovframework.sample.cmmn.SearchVO;

/**
 * 부서정보를 저장하기 위한 VO클래스
 * 
 * @author Daniela Kwon
 * @since 2014.01.24
 * @version 3.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2014.04.07	Daniela Kwon		최초생성
 * 
 * </pre>
 */

public class DeptVO extends SearchVO {

	private static final long serialVersionUID = 1L;
	private String deptNo;
	private String deptNm;
	private String deptLoc;
	private String deptTel;

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptNm() {
		return deptNm;
	}

	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	public String getDeptTel() {
		return deptTel;
	}

	public void setDeptTel(String deptTel) {
		this.deptTel = deptTel;
	}
}