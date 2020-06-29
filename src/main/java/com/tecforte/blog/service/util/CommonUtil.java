package com.tecforte.blog.service.util;

import com.tecforte.blog.service.dto.EntryDTO;

public class CommonUtil {

	public CommonUtil(){

	}
	
	public boolean validateEntryEmoji(EntryDTO entryDTO) {
		
		boolean flagValidate = false;

		if(entryDTO.getBlogIsPositive()
			&&(entryDTO.getEmoji().toString().equalsIgnoreCase("sad")
				|| entryDTO.getEmoji().toString().equalsIgnoreCase("angry")
				)){
					flagValidate = false;
		}else if(!entryDTO.getBlogIsPositive()
					&&(entryDTO.getEmoji().toString().equalsIgnoreCase("like")
						|| entryDTO.getEmoji().toString().equalsIgnoreCase("haha")
				)){
				flagValidate = false;
		}else{
			flagValidate = true;
		}
		
		return flagValidate;
	}

}
