def solution(citations):
    citations.sort()  # 정렬을 해놓는 것이 중요. 정렬 이후엔 해당 원소 뒤에는 다 그것보다 많이 인용된 것.

    l = len(citations)
    for i in range(l):

        if citations[i] >= l - i:
            # 논문이 인용된 횟수(h번 이상) >= 인용된 논문의 개수(h개 == h번)
            return l - i
    return 0