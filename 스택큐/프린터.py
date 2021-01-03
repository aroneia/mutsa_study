def solution(priorities, location):
    answer = 0

    while (len(priorities) != 0):
        # 제일 앞에 있을 때
        if location == 0:
            if priorities[0] < max(priorities):  # 최대값이 아니면 뒤로 보내주기
                priorities.append(priorities.pop(0))
                location = len(priorities) - 1
            else:  # 출력
                return answer + 1

        else:
            if priorities[0] < max(priorities):  # 최대값이 아니면 뒤로 보내주기
                priorities.append(priorities.pop(0))
                location -= 1  # 한 칸씩 앞으로 당기기
            else:  # 최대값이면
                priorities.pop(0)
                location -= 1
                answer += 1

# 배열에서 최대값 구하기: max(배열)     ex) max(priorities)