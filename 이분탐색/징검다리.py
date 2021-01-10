import math


def solution(distance, rocks, n):
    answer = 0
    start, end = 0, distance

    rocks = sorted(rocks)
    rocks.append(distance)

    rnum = len(rocks)  # 돌의 갯수

    while start <= end:
        remove = 0
        prev = 0
        min_inter = math.inf
        mid = (start + end) // 2

        for i in range(rnum):
            if rocks[i] - prev < mid:  # rocks[i]-prev가 inter값
                remove += 1  # 바위제거

            else:  # 바위 제거 안할경우
                min_inter = min(min_inter, rocks[i] - prev)  # inter값 갱신.
                prev = rocks[i]  # 현재 바위위치를 prev로

        # 너무 많이 제거되었을 경우, 기준을 높여서 제거를 줄여야함
        if remove > n:
            end = mid - 1

        # 적게 제거되었을 경우, 기준을 낮춰서 제거를 늘려야함
        else:
            answer = min_inter
            start = mid + 1

    return answer