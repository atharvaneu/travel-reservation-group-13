package edu.neu.csye7374.Decorator;
public class PremiumUpgrade extends FlightUpgrade{
    double premiumChargeValue = 99.99;
    public PremiumUpgrade(FlightUpgradeOptions upgradeOptions) {
        super(upgradeOptions);
    }

    public double getBasePrice() {
        return this.upgradeOptions.getBasePrice() + premiumChargeValue;
    }

    public String getUpgradeDescription() {
        return this.upgradeOptions.getUpgradeDescription() + " with Premium Upgrade";
    }

}
