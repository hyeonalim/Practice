class Solution {
    public String solution(String new_id) {
		// 1. 모든 대문자를 소문자로 치환
        //toLowerCase(): 문자열을 소문자로 변환하여 반환
		new_id = new_id.toLowerCase();

		// 2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
		String id = "";
        //id의 길이를 받아 모든 문자 확인
		for(int i = 0; i < new_id.length(); i++) {
            //charAt(): String으로 저장된 문자열 중 한 글자만 선택해 char타입으로 변환
			char ch = new_id.charAt(i);

			//2-1. 소문자 확인(a~z까지)
            if(ch >= 'a' && ch <= 'z') {
				id += String.valueOf(ch);
			}
            //2-2. 숫자 확인(0~9 까지)
            else if(ch >= '0' && ch <= '9') {
				id += String.valueOf(ch);
			}
            //2-3. 빼기(-), 밑줄(_), 마침표(.) 확인
            else if(ch == '.' || ch == '-' || ch == '_') {
				id += String.valueOf(ch);
			}
		}

		// 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
		for(int i = 0; i < id.length(); i++) {
            //3-1. 마침표가 있는지 확인
			if(id.charAt(i) == '.') {
				int j = i+1;
				String dot = ".";

				//3-2. 마침표가 있는 위치가 아닌 경우, 그 다음은 마침표가 있는지 확인
                while(j != id.length() && id.charAt(j) == '.') {
					dot += ".";
					j++;
				}

				//3-3. 마침표가 1개 이상인 경우, 마침표 삭제(replace())
                if(dot.length() > 1)
					id = id.replace(dot, ".");
			}
		}

		// 4. 마침표(.)가 처음이나 끝에 위치한다면 제거
		//4-1. startsWith(): 문자열이 특정 문자로 시작하는지 확인
        //substring(start, end): start~end까지의 문자열만 가져오기
        if(id.startsWith(".") ) {
			id = id.substring(1, id.length());
		}
        //4-2. endsWith(): 문자열이 특정 문자로 끝나는지 확인
        else if(id.endsWith(".")) {
			id = id.substring(0, id.length()-1);
		}

		// 5. 빈 문자열이라면, a를 대입
		if(id.length() == 0) {
			id += "a";
		}

		// 6. 16자 이상이면, 첫 15개의 문자를 제외한 나머지 모두 제거
        //만약 제거 후 마침표(.)가 끝에 위치하면 제거
		if(id.length() >= 16) {
			id = id.substring(0, 15);
		}
        
		//6-1. 마지막 . 제거 
		if(id.endsWith(".")) {
			id = id.substring(0, id.length()-1);
		}

		// 7. 2자 이하, 마지막 문자를 길이가 3이 될 때까지 반복
		String last = id.charAt(id.length()-1) + "";
        //7-1. 길이가 2인 경우
		if(id.length() == 2) {
			id = id + last;
		}
        //7-2. 길이가 1인 경우
        else if(id.length() == 1) {
			id = id + last + last;
		}

		return id;
    }
}