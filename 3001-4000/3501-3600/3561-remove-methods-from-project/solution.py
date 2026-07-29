class Solution(object):
    def remainingMethods(self, n, k, invocations):
        graph = defaultdict(list)
        reverse_graph = defaultdict(list)
        for i, j in invocations:
            graph[i].append(j)
            reverse_graph[j].append(i)
        suspicious = set()
        queue = deque([k])
        while queue:
            node = queue.popleft()
            if node not in suspicious:
                suspicious.add(node)
                for neighbor in graph[node]:
                    if neighbor not in suspicious:
                        queue.append(neighbor)
        has_external_invocations = False
        for method in suspicious:
            for invoker in reverse_graph[method]:
                if invoker not in suspicious:
                    has_external_invocations = True
                    break
            if has_external_invocations:
                break
        if has_external_invocations:
            return list(range(n))
        else:
            return [method for method in range(n) if method not in suspicious]
