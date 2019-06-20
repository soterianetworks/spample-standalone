import {Component, Injector} from '@angular/core';

import {BasePageComponent} from '../../common/base-page.component';
import {MachineService} from '../machine.service';

@Component({
    templateUrl: './list.component.html',
    styleUrls: ['../../../../assets/layout/css/list.css'],
})
export class MachineListComponent extends BasePageComponent {
    constructor(protected service: MachineService, protected injector: Injector) {
        super(service, injector);
    }
}

