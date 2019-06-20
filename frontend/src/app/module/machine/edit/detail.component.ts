import {Component, Injector} from '@angular/core';
import {BaseDetailsComponent} from '../../common/base-details.component';

import {Machine} from '../machine.model';
import {MachineService} from '../machine.service';

@Component({
    templateUrl: './detail.component.html',
    styleUrls: ['./detail.component.css'],
})
export class MachineDetailComponent extends BaseDetailsComponent<Machine> {
    constructor(protected service: MachineService, protected injector: Injector) {
        super(service, injector);
    }

    init() {
        if (this.isCreate) {
            this.object = new Machine();
        }
    }
}
