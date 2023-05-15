package sew_test;
import java.util.*;

public class PatchPanel {

    /* diese Attribute nicht ändern */
    private static final int DEFAULTNUMPORTS = 24;
    private int numports;
    private final Map<Integer, Connectable> connections;

    // TODO Collection auswählen und Attribut deklarieren
    public PatchPanel(int numports) {
        this.numports = numports;
        this.connections = new HashMap<>();
    }

    public PatchPanel() {
        this(DEFAULTNUMPORTS);
    }

    /**
     * Verbindet das Gerät device mit dem Port portnum.
     *
     * @param portnum Nummer des Ports, an dem das Gerät angeschlossen wird
     * @param device  Gerät, das verbunden werden soll
     * @throws AlreadyConnectedException wird geworfen, wenn an diesem Port schon ein anderes
     *                                   Gerät verbunden ist ODER das gleiche Gerät bereits mit dem Patchfeld verbunden ist.
     */
    public void connect(int portnum, Connectable device) throws AlreadyConnectedException {
        if (connections.containsValue(device)) {
            throw new AlreadyConnectedException("Device already connected.");
        }
        if (connections.containsKey(portnum)) {
            throw new AlreadyConnectedException("Port already occupied.");
        }
        connections.put(portnum, device);
    }

    /**
     * Trennt das Gerät vom Port portnum.
     *
     * @param portnum Nummer des Ports, an dem das Gerät angeschlossen ist
     * @return true, wenn ein Gerät am Port portnum angeschlossen war und erfolgreich getrennt wurde,
     *         false, wenn kein Gerät angeschlossen war
     */
    public boolean disconnect(int portnum) {
        if (connections.containsKey(portnum)) {
            connections.remove(portnum);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Trennt alle Verbindungen zu einem Gerät.
     *
     * @param device das zu trennende Gerät
     * @return die Anzahl der getrennten Verbindungen
     */
    public int disconnect(Connectable device) {
        int count = 0;
        for (Map.Entry<Integer, Connectable> entry : connections.entrySet()) {
            if (entry.getValue().equals(device)) {
                connections.remove(entry.getKey());
                count++;
            }
        }
        return count;
    }
    /**
     * Prüft, ob das Gerät device mit dem Patchfeld verbunden ist.
     *
     * @param device das zu prüfende Gerät
     * @return die Nummer des Ports, an dem das Gerät verbunden ist,
     *         oder -1, wenn das Gerät nicht verbunden ist
     */
    public int isConnected(Connectable device) {
        for (Map.Entry<Integer, Connectable> entry : connections.entrySet()) {
            if (entry.getValue().equals(device)) {
                return entry.getKey();
            }
        }
        return -1;
    }

    /**
     * Gibt ein Array zurück, das alle verbundenen Geräte in der Form "Portnum: Gerätetyp (Seriennummer)" enthält.
     *
     * @return ein Array mit den Verbindungen
     */
    public String[] listConnections() {
        String[] result = new String[connections.size()];
        int i = 0;
        for (Map.Entry<Integer, Connectable> entry : connections.entrySet()) {
            int portnum = entry.getKey();
            Connectable device = entry.getValue();
            String type = device.getType();
            long serialNumber = device.getSerialNumber();
            String connection = String.format("%d: %s (%d)", portnum, type, serialNumber);
            result[i] = connection;
            i++;
        }
        return result;
    }
/**
 * Trennt alle Verbindungen zu einem Gerät.
 *
 * @param device das zu trennende Gerät
 * @return die Anzahl der getrennten Verbindungen
 */
public int disconnect(Connectable device) {
        int count = 0;
        for (int portnum : connections.keySet()) {
            Connectable connectedDevice = connections.get(portnum);
            if (connectedDevice.equals(device)) {
                connections.remove(portnum);
                count++;
            }
        }
        return count;
        }

/**
 * Überprüft, ob ein Gerät mit dem Patchfeld verbunden ist.
 *
 * @param device das zu überprüfende Gerät
 * @return die Portnummer, an dem das Gerät angeschlossen ist, oder -1, wenn das Gerät nicht angeschlossen ist
 */
public int isConnected(Connectable device) {
        for (int portnum : connections.keySet()) {
            Connectable connectedDevice = connections.get(portnum);
            if (connectedDevice.equals(device)) {
                return portnum;
            }
        }
        return -1;
}

/**
 * Liefert ein Array mit allen Geräten, die aktuell am Patchfeld angeschlossen sind.
 *
 * @return ein Array mit den Typen aller angeschlossenen Geräte
 */
public String[] listConnections() {
        String[] connectedDevices = new String[connections.size()];
        int i = 0;
        for (int portnum : connections.keySet()) {
            Connectable connectedDevice = connections.get(portnum);
            connectedDevices[i] = connectedDevice.getType();
            i++;
            }
        return connectedDevices;
        }
}
