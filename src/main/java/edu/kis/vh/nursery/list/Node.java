package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca węzeł (node) w strukturze danych typu lista podwójnie związana.
 * Węzeł zawiera wartość oraz wskaźniki na poprzedni i następny węzeł w liście.
 * 
 * Atrybuty:
 * - value: przechowuje wartość węzła typu całkowitego (int).
 * - prev: wskaźnik na poprzedni węzeł w liście.
 * - next: wskaźnik na następny węzeł w liście.
 * 
 * Konstruktor:
 * - Node(int i): inicjalizuje węzeł z wartością i.
 */

public class Node {

    public final int value;
    public Node prev, next;

    public Node(int i) {
        value = i;
    }

}
