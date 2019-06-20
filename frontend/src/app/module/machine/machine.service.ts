import {Injectable, Injector} from '@angular/core';

import {BaseService} from '../common/base.service';
import {Machine} from './machine.model';

@Injectable()
export class MachineService extends BaseService<Machine> {
    constructor(protected injector: Injector) {
        super(injector);
    }

    get fullPath() {
        return '/api' + this.path;
    }

    get path() {
        return '/machines/';
    }

    instance(o): Machine {
        return new Machine(o);
    }
}
