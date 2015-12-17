// Given a directed graph, design an algorithm to find out whether
// there is a route between two nodes

public enum State {
    Unvisited, Visited;
}

//Breadth First Search
public boolean isRoute(Graph g, Node a, Node b) {
    ArrayList list = new ArrayList();
    list.add(a);

    for (Node u : g.getNodes()) {
        u.state = State.Unvisited;
    }

    while (!(list.isEmpty())) {
        Node curr = list.removeFirst();
        for (Node t : curr.getAdjacents()) {
            if (t == b) {
                return true;
            }
            if (t.state == State.Unvisited) {
                t.state = State.Visited;
                list.add(t);
            }
        }
    }
    return false;
}

// Depth First Search
public boolean isRoute(Node a, Node b) {
    if (a == null || b == null) {
        return false;
    }
    a.state = State.Visited;
    if (a == b) {
        return true;
    }
    for (Node t : a.getAdjacents()) {
        if (t.state == State.Unvisited && isRoute(t, b)) {
            return true;
        }
    }
    return false;
}
