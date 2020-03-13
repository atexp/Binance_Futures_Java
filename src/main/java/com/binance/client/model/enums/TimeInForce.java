package com.binance.client.model.enums;

public enum  TimeInForce {
    /** Good-till-cancelled */
    GTC,
    /** Immediate-or-cancel (enforces being taker) */
    IOC,
    /** Fill-or-kill (i.e. IOC but only trades when full quantity can be filled */
    FOK,
    /** Good-till-crossing (= post-only, enforces being maker) */
    GTX
}
