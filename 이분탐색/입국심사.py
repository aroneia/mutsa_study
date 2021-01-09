def solution(n, times):
    answer = 0
    left = 1
    right = n * max(times)

    while left <= right:
        count = 0

        mid = (left + right) // 2  # 중간값

        for time in times:
            count += mid // time  # mid값일 때 처리 가능한 사람의 수
            if count >= n:  # 더 많이 처리할 수 있으면 반복문 그만
                break

        # 더 많이 처리할 수 있을 때   > mid 값을 줄이게 범위 조정(mid보다 앞 부분 탐색)
        if count >= n:
            answer = mid
            right = mid - 1
        else:  # mid보다 뒷부분 탐색
            left = mid + 1

    return answer