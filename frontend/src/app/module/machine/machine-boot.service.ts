import {Injectable} from '@angular/core';

import {MachineI18nService} from './i18n/machine-i18n.service';

@Injectable()
export class MachineBootService {
    constructor(protected i18nService: MachineI18nService) {
    }

    init() {
        this.registerI18n();
    }

    private registerI18n(): void {
        this.i18nService.init();
    }
}
