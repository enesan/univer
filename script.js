class Spread {
    _beta;
    _gamma;
    _infected;
    _susceptible;
    _recovered;

    constructor(initialInfectedFraction, beta, gamma) {
        this._infected = initialInfectedFraction;
        this._beta = beta;
        this._gamma = gamma;
        this._susceptible = 1 - initialInfectedFraction;
    }

    SI() {
        this._susceptible = -this._beta * this._infected * this._susceptible;
        this._infected = this._beta * this._infected * this._susceptible - this._gamma * this._infected;
        this._recovered = this._gamma * this._infected;
    }
}

const model = new Spread(0.2, 0.3, 0.2);
model.SI();